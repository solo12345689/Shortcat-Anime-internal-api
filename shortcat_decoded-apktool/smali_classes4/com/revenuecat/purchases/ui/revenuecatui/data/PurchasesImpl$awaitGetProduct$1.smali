.class final Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl$awaitGetProduct$1;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl;->awaitGetProduct(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl"
    f = "PurchasesType.kt"
    l = {
        0x5b
    }
    m = "awaitGetProduct"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl;LZd/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl;",
            "LZd/e;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl$awaitGetProduct$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(LZd/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl$awaitGetProduct$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl$awaitGetProduct$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl$awaitGetProduct$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl$awaitGetProduct$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl;->awaitGetProduct(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
