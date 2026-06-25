.class final LD/k$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/k;->c(Ljava/lang/Object;Ljava/lang/Object;Lie/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lie/o;


# direct methods
.method constructor <init>(Lie/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/k$c;->a:Lie/o;

    .line 2
    .line 3
    const/4 p1, 0x4

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LD/c;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LY/m;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LD/k$c;->invoke(LD/c;ILY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LD/c;ILY/m;I)V
    .locals 2

    and-int/lit8 p2, p4, 0x6

    if-nez p2, :cond_1

    invoke-interface {p3, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p4, p2

    :cond_1
    and-int/lit16 p2, p4, 0x83

    const/16 v0, 0x82

    if-ne p2, v0, :cond_3

    .line 2
    invoke-interface {p3}, LY/m;->i()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p3}, LY/m;->K()V

    return-void

    :cond_3
    :goto_1
    invoke-static {}, LY/w;->L()Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, -0x1

    const-string v0, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)"

    const v1, -0x3c36593a

    invoke-static {v1, p4, p2, v0}, LY/w;->U(IIILjava/lang/String;)V

    :cond_4
    iget-object p2, p0, LD/k$c;->a:Lie/o;

    and-int/lit8 p4, p4, 0xe

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p2, p1, p3, p4}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LY/w;->T()V

    :cond_5
    return-void
.end method
