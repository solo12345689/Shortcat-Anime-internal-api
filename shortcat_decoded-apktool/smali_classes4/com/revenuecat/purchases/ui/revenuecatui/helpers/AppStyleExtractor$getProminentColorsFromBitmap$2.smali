.class final Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor;->getProminentColorsFromBitmap(Landroid/graphics/Bitmap;ILGf/K;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LGf/O;",
        "",
        "Ls0/r0;",
        "<anonymous>",
        "(LGf/O;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor$getProminentColorsFromBitmap$2"
    f = "AppStyleExtractor.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $bitmap:Landroid/graphics/Bitmap;

.field final synthetic $count:I

.field label:I


# direct methods
.method constructor <init>(Landroid/graphics/Bitmap;ILZd/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "I",
            "LZd/e;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;->$bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iput p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;->$count:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LZd/e;",
            ")",
            "LZd/e;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;->$bitmap:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;->$count:I

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;-><init>(Landroid/graphics/Bitmap;ILZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGf/O;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;->$bitmap:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor$getProminentColorsFromBitmap$2;->$count:I

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/AppStyleExtractor;->extractProminentColors$revenuecatui_defaultsBc8Release(Landroid/graphics/Bitmap;I)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method
