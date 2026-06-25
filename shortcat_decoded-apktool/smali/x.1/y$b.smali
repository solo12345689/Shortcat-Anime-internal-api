.class final Lx/y$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/y;->F1(LB/m;LB/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/m;

.field final synthetic b:LB/j;


# direct methods
.method constructor <init>(LB/m;LB/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/y$b;->a:LB/m;

    .line 2
    .line 3
    iput-object p2, p0, Lx/y$b;->b:LB/j;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lx/y$b;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lx/y$b;->a:LB/m;

    iget-object v0, p0, Lx/y$b;->b:LB/j;

    invoke-interface {p1, v0}, LB/m;->a(LB/j;)Z

    return-void
.end method
