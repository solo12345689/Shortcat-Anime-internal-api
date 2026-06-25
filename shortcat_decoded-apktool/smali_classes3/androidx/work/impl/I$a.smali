.class final Landroidx/work/impl/I$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/I;->c(Landroidx/work/impl/E;Ljava/lang/String;Li4/u;)Li4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li4/u;

.field final synthetic b:Landroidx/work/impl/E;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Landroidx/work/impl/o;


# direct methods
.method constructor <init>(Li4/u;Landroidx/work/impl/E;Ljava/lang/String;Landroidx/work/impl/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/work/impl/I$a;->a:Li4/u;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/work/impl/I$a;->b:Landroidx/work/impl/E;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/work/impl/I$a;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/work/impl/I$a;->d:Landroidx/work/impl/o;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/work/impl/I$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    iget-object v0, p0, Landroidx/work/impl/I$a;->a:Li4/u;

    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 3
    new-instance v1, Landroidx/work/impl/x;

    iget-object v2, p0, Landroidx/work/impl/I$a;->b:Landroidx/work/impl/E;

    iget-object v3, p0, Landroidx/work/impl/I$a;->c:Ljava/lang/String;

    sget-object v4, Li4/d;->b:Li4/d;

    invoke-direct {v1, v2, v3, v4, v0}, Landroidx/work/impl/x;-><init>(Landroidx/work/impl/E;Ljava/lang/String;Li4/d;Ljava/util/List;)V

    .line 4
    new-instance v0, Lo4/c;

    iget-object v2, p0, Landroidx/work/impl/I$a;->d:Landroidx/work/impl/o;

    invoke-direct {v0, v1, v2}, Lo4/c;-><init>(Landroidx/work/impl/x;Landroidx/work/impl/o;)V

    invoke-virtual {v0}, Lo4/c;->run()V

    return-void
.end method
