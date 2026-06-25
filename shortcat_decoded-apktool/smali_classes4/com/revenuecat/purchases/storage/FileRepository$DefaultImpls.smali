.class public final Lcom/revenuecat/purchases/storage/FileRepository$DefaultImpls;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/storage/FileRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
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


# direct methods
.method public static synthetic generateOrGetCachedFileURL$default(Lcom/revenuecat/purchases/storage/FileRepository;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/revenuecat/purchases/storage/FileRepository;->generateOrGetCachedFileURL$default(Lcom/revenuecat/purchases/storage/FileRepository;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic getFile$default(Lcom/revenuecat/purchases/storage/FileRepository;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;ILjava/lang/Object;)Ljava/net/URI;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/storage/FileRepository;->getFile$default(Lcom/revenuecat/purchases/storage/FileRepository;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;ILjava/lang/Object;)Ljava/net/URI;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
