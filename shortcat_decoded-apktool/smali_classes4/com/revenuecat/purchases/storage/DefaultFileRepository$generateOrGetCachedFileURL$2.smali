.class final Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/storage/DefaultFileRepository;->generateOrGetCachedFileURL(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LGf/W;",
        "Ljava/net/URI;",
        "invoke",
        "()LGf/W;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $checksum:Lcom/revenuecat/purchases/models/Checksum;

.field final synthetic $url:Ljava/net/URL;

.field final synthetic this$0:Lcom/revenuecat/purchases/storage/DefaultFileRepository;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/storage/DefaultFileRepository;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2;->this$0:Lcom/revenuecat/purchases/storage/DefaultFileRepository;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2;->$url:Ljava/net/URL;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2;->$checksum:Lcom/revenuecat/purchases/models/Checksum;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()LGf/W;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGf/W;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2;->this$0:Lcom/revenuecat/purchases/storage/DefaultFileRepository;

    invoke-static {v0}, Lcom/revenuecat/purchases/storage/DefaultFileRepository;->access$getIoScope$p(Lcom/revenuecat/purchases/storage/DefaultFileRepository;)LGf/O;

    move-result-object v1

    new-instance v4, Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2$1;

    iget-object v0, p0, Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2;->this$0:Lcom/revenuecat/purchases/storage/DefaultFileRepository;

    iget-object v2, p0, Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2;->$url:Ljava/net/URL;

    iget-object v3, p0, Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2;->$checksum:Lcom/revenuecat/purchases/models/Checksum;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v2, v3, v5}, Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2$1;-><init>(Lcom/revenuecat/purchases/storage/DefaultFileRepository;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;LZd/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/storage/DefaultFileRepository$generateOrGetCachedFileURL$2;->invoke()LGf/W;

    move-result-object v0

    return-object v0
.end method
