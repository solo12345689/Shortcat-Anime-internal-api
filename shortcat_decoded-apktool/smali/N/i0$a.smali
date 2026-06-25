.class final LN/i0$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/i0;->s(LK/y;Landroid/view/inputmethod/RemoveSpaceGesture;LU0/e;Landroidx/compose/ui/platform/A1;Lkotlin/jvm/functions/Function1;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;

.field final synthetic b:Lkotlin/jvm/internal/L;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/i0$a;->a:Lkotlin/jvm/internal/L;

    .line 2
    .line 3
    iput-object p2, p0, LN/i0$a;->b:Lkotlin/jvm/internal/L;

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
.method public final invoke(LDf/l;)Ljava/lang/CharSequence;
    .locals 3

    .line 2
    iget-object v0, p0, LN/i0$a;->a:Lkotlin/jvm/internal/L;

    iget v1, v0, Lkotlin/jvm/internal/L;->a:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 3
    invoke-interface {p1}, LDf/l;->c()Loe/f;

    move-result-object v1

    invoke-virtual {v1}, Loe/d;->f()I

    move-result v1

    iput v1, v0, Lkotlin/jvm/internal/L;->a:I

    .line 4
    :cond_0
    iget-object v0, p0, LN/i0$a;->b:Lkotlin/jvm/internal/L;

    invoke-interface {p1}, LDf/l;->c()Loe/f;

    move-result-object p1

    invoke-virtual {p1}, Loe/d;->i()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Lkotlin/jvm/internal/L;->a:I

    .line 5
    const-string p1, ""

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LDf/l;

    invoke-virtual {p0, p1}, LN/i0$a;->invoke(LDf/l;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
