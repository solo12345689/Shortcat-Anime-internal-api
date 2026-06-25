.class final Lc4/e$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc4/e;->o()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc4/e;


# direct methods
.method constructor <init>(Lc4/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc4/e$d;->a:Lc4/e;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 4

    .line 2
    iget-object v0, p0, Lc4/e$d;->a:Lc4/e;

    invoke-static {v0}, Lc4/e;->c(Lc4/e;)LZ3/a;

    move-result-object v0

    invoke-virtual {v0}, LZ3/a;->c()Ljava/lang/Class;

    move-result-object v0

    .line 3
    const-string v1, "getWindowLayoutComponent"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lc4/e$d;->a:Lc4/e;

    invoke-static {v1}, Lc4/e;->d(Lc4/e;)Ljava/lang/Class;

    move-result-object v1

    .line 5
    sget-object v2, Lh4/a;->a:Lh4/a;

    const-string v3, "getWindowLayoutComponentMethod"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lh4/a;->d(Ljava/lang/reflect/Method;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {v2, v0, v1}, Lh4/a;->b(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc4/e$d;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
