.class final LF/E$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/E;->a(Lie/o;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/D;

.field final synthetic b:Lie/o;


# direct methods
.method constructor <init>(LF/D;Lie/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/E$a;->a:LF/D;

    .line 2
    .line 3
    iput-object p2, p0, LF/E$a;->b:Lie/o;

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

    invoke-virtual {p0, p1, p2}, LF/E$a;->invoke(LY/m;I)V

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

    const-string v1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)"

    const v2, 0x6f1942e8

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LF/E$a;->a:LF/D;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lh0/o;->b(LY/m;I)Lh0/g;

    move-result-object v1

    invoke-virtual {p2, v1}, LF/D;->i(Lh0/g;)V

    .line 5
    iget-object p2, p0, LF/E$a;->b:Lie/o;

    iget-object v1, p0, LF/E$a;->a:LF/D;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v1, p1, v0}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
