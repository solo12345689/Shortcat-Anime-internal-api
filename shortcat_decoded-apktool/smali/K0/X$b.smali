.class final LK0/X$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/X;-><init>(LK0/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/X;


# direct methods
.method constructor <init>(LK0/X;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/X$b;->a:LK0/X;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X$b;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, LK0/X$b;->a:LK0/X;

    invoke-static {v0}, LK0/X;->u1(LK0/X;)V

    .line 3
    iget-object v0, p0, LK0/X$b;->a:LK0/X;

    sget-object v1, LK0/X$b$a;->a:LK0/X$b$a;

    invoke-virtual {v0, v1}, LK0/X;->C0(Lkotlin/jvm/functions/Function1;)V

    .line 4
    iget-object v0, p0, LK0/X$b;->a:LK0/X;

    invoke-virtual {v0}, LK0/X;->f0()LK0/e0;

    move-result-object v0

    invoke-virtual {v0}, LK0/e0;->M1()LI0/C;

    move-result-object v0

    invoke-interface {v0}, LI0/C;->A()V

    .line 5
    iget-object v0, p0, LK0/X$b;->a:LK0/X;

    invoke-static {v0}, LK0/X;->o1(LK0/X;)V

    .line 6
    iget-object v0, p0, LK0/X$b;->a:LK0/X;

    sget-object v1, LK0/X$b$b;->a:LK0/X$b$b;

    invoke-virtual {v0, v1}, LK0/X;->C0(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
