.class final Ly/k$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/k;->b(Ljava/lang/String;ZLy/b;Landroidx/compose/ui/e;Lie/o;Lie/a;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lie/a;


# direct methods
.method constructor <init>(ZLie/a;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ly/k$b;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, Ly/k$b;->b:Lie/a;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly/k$b;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-boolean v0, p0, Ly/k$b;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly/k$b;->b:Lie/a;

    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
