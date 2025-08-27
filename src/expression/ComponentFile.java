package expression;

import java.util.List;

public class ComponentFile implements ASTNode {
    private List<Imports> imports;
    private ComponentDeclaration componentDeclaration;
    private List<EntityDecl> entities;
    private List<StoreDecl> stores;
    private List<RouteDecl> routes;
    private List<PageDecl> pages;

    public ComponentFile(List<Imports> imports,
                         ComponentDeclaration componentDeclaration,
                         List<EntityDecl> entities,
                         List<StoreDecl> stores,
                         List<RouteDecl> routes,
                         List<PageDecl> pages) {
        this.imports = imports;
        this.componentDeclaration = componentDeclaration;
        this.entities = entities;
        this.stores = stores;
        this.routes = routes;
        this.pages = pages;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ComponentFile:");

        // ==== Imports ====
        for (Imports imp : imports) {
            if (imp != null) imp.print(indent + "  ");
        }

        // ==== Component Declaration ====
        if (componentDeclaration != null) {
            componentDeclaration.print(indent + "  ");
        }

        // ==== Entities ====
        for (EntityDecl e : entities) {
            if (e != null) e.print(indent + "  ");
        }

        // ==== Stores ====
        for (StoreDecl s : stores) {
            if (s != null) s.print(indent + "  ");
        }

        // ==== Routes ====
        for (RouteDecl r : routes) {
            if (r != null) r.print(indent + "  ");
        }

        // ==== Pages ====
        for (PageDecl p : pages) {
            if (p != null) p.print(indent + "  ");
        }
    }
}
