.class public final Lr8/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt8/b;


# instance fields
.field private final a:Ljavax/inject/Provider;

.field private final b:Ljavax/inject/Provider;

.field private final c:Ljavax/inject/Provider;

.field private final d:Ljavax/inject/Provider;

.field private final e:Ljavax/inject/Provider;


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr8/v;->a:Ljavax/inject/Provider;

    .line 5
    .line 6
    iput-object p2, p0, Lr8/v;->b:Ljavax/inject/Provider;

    .line 7
    .line 8
    iput-object p3, p0, Lr8/v;->c:Ljavax/inject/Provider;

    .line 9
    .line 10
    iput-object p4, p0, Lr8/v;->d:Ljavax/inject/Provider;

    .line 11
    .line 12
    iput-object p5, p0, Lr8/v;->e:Ljavax/inject/Provider;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lr8/v;
    .locals 6

    .line 1
    new-instance v0, Lr8/v;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lr8/v;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static c(LB8/a;LB8/a;Lx8/e;Ly8/r;Ly8/v;)Lr8/t;
    .locals 6

    .line 1
    new-instance v0, Lr8/t;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lr8/t;-><init>(LB8/a;LB8/a;Lx8/e;Ly8/r;Ly8/v;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public b()Lr8/t;
    .locals 5

    .line 1
    iget-object v0, p0, Lr8/v;->a:Ljavax/inject/Provider;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LB8/a;

    .line 8
    .line 9
    iget-object v1, p0, Lr8/v;->b:Ljavax/inject/Provider;

    .line 10
    .line 11
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, LB8/a;

    .line 16
    .line 17
    iget-object v2, p0, Lr8/v;->c:Ljavax/inject/Provider;

    .line 18
    .line 19
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lx8/e;

    .line 24
    .line 25
    iget-object v3, p0, Lr8/v;->d:Ljavax/inject/Provider;

    .line 26
    .line 27
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ly8/r;

    .line 32
    .line 33
    iget-object v4, p0, Lr8/v;->e:Ljavax/inject/Provider;

    .line 34
    .line 35
    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ly8/v;

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3, v4}, Lr8/v;->c(LB8/a;LB8/a;Lx8/e;Ly8/r;Ly8/v;)Lr8/t;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr8/v;->b()Lr8/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
