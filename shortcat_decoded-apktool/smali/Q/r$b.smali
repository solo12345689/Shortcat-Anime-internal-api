.class final LQ/r$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/r;->l(LQ/w;LQ/j;LQ/k$a;)LQ/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/j;

.field final synthetic b:I


# direct methods
.method constructor <init>(LQ/j;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/r$b;->a:LQ/j;

    .line 2
    .line 3
    iput p2, p0, LQ/r$b;->b:I

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
.method public final invoke()Ljava/lang/Integer;
    .locals 2

    .line 2
    iget-object v0, p0, LQ/r$b;->a:LQ/j;

    invoke-virtual {v0}, LQ/j;->k()LU0/T0;

    move-result-object v0

    iget v1, p0, LQ/r$b;->b:I

    invoke-virtual {v0, v1}, LU0/T0;->q(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LQ/r$b;->invoke()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
