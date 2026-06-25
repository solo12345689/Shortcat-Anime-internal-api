.class public final LYc/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZc/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LYc/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LYc/b;->a:Landroid/content/Context;

    .line 10
    .line 11
    new-instance v0, LYc/h;

    .line 12
    .line 13
    invoke-direct {v0, p1}, LYc/h;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LYc/b;->b:LYc/h;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(LPc/c;)LPc/c;
    .locals 1

    .line 1
    const-string v0, "category"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYc/b;->b:LYc/h;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LYc/h;->e(LPc/c;)LPc/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "identifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYc/b;->b:LYc/h;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LYc/h;->d(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public c()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, LYc/b;->b:LYc/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LYc/h;->a()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
