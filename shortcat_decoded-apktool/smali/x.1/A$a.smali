.class final Lx/A$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/A;->E1()LI0/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Lx/A;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Lx/A;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/A$a;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    iput-object p2, p0, Lx/A$a;->b:Lx/A;

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
    invoke-virtual {p0}, Lx/A$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lx/A$a;->a:Lkotlin/jvm/internal/N;

    iget-object v1, p0, Lx/A$a;->b:Lx/A;

    invoke-static {}, LI0/J;->a()LY/b1;

    move-result-object v2

    invoke-static {v1, v2}, LK0/i;->a(LK0/h;LY/D;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method
