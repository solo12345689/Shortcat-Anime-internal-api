.class final LD/n$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/n;->e(ILjava/lang/Object;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD/n;

.field final synthetic b:I


# direct methods
.method constructor <init>(LD/n;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/n$a;->a:LD/n;

    .line 2
    .line 3
    iput p2, p0, LD/n$a;->b:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LD/n$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)"

    const v2, -0x3128503e

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LD/n$a;->a:LD/n;

    invoke-static {p2}, LD/n;->j(LD/n;)LD/k;

    move-result-object p2

    iget v0, p0, LD/n$a;->b:I

    iget-object v1, p0, LD/n$a;->a:LD/n;

    .line 5
    invoke-virtual {p2}, LF/m;->g()LF/d;

    move-result-object p2

    invoke-interface {p2, v0}, LF/d;->get(I)LF/d$a;

    move-result-object p2

    .line 6
    invoke-virtual {p2}, LF/d$a;->b()I

    move-result v2

    sub-int/2addr v0, v2

    .line 7
    invoke-virtual {p2}, LF/d$a;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LD/j;

    .line 8
    invoke-virtual {p2}, LD/j;->a()Lie/p;

    move-result-object p2

    invoke-virtual {v1}, LD/n;->g()LD/d;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v1, v0, p1, v2}, Lie/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
