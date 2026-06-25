.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LGf/O;",
        "LTd/L;",
        "<anonymous>",
        "(LGf/O;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$rememberVideoContentState$1$1$3$1"
    f = "VideoComponentView.kt"
    l = {
        0x96
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $it:Ljava/net/URL;

.field final synthetic $repository:Lcom/revenuecat/purchases/storage/FileRepository;

.field final synthetic $videoUrls:Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

.field label:I


# direct methods
.method constructor <init>(Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;LZd/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;",
            "Lcom/revenuecat/purchases/storage/FileRepository;",
            "LZd/e;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->$it:Ljava/net/URL;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->$videoUrls:Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->$repository:Lcom/revenuecat/purchases/storage/FileRepository;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3
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
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->$it:Ljava/net/URL;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->$videoUrls:Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->$repository:Lcom/revenuecat/purchases/storage/FileRepository;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;-><init>(Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;LZd/e;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->$it:Ljava/net/URL;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->$videoUrls:Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;->getChecksumLowRes()Lcom/revenuecat/purchases/models/Checksum;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->$repository:Lcom/revenuecat/purchases/storage/FileRepository;

    .line 36
    .line 37
    iput v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt$rememberVideoContentState$1$1$3$1;->label:I

    .line 38
    .line 39
    invoke-static {p1, v1, v3, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->cacheVideo(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Lcom/revenuecat/purchases/storage/FileRepository;LZd/e;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 47
    .line 48
    return-object p1
.end method
