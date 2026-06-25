.class public final Lcom/facebook/react/modules/image/ImageLoaderModule$e;
.super Lcom/facebook/react/bridge/GuardedAsyncTask;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/image/ImageLoaderModule;->queryCache(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/bridge/Promise;

.field final synthetic b:Lcom/facebook/react/modules/image/ImageLoaderModule;

.field final synthetic c:Lcom/facebook/react/bridge/ReadableArray;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/modules/image/ImageLoaderModule;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->a:Lcom/facebook/react/bridge/Promise;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->b:Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->c:Lcom/facebook/react/bridge/ReadableArray;

    .line 6
    .line 7
    invoke-static {p4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p4}, Lcom/facebook/react/bridge/GuardedAsyncTask;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)V
    .locals 8

    .line 1
    const-string v0, "params"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->b:Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->c:Lcom/facebook/react/bridge/ReadableArray;

    .line 9
    .line 10
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/facebook/react/modules/image/ImageLoaderModule;->access$getImagePipeline(Lcom/facebook/react/modules/image/ImageLoaderModule;)Lz6/t;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x0

    .line 28
    :goto_0
    if-ge v4, v3, :cond_3

    .line 29
    .line 30
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {p1, v6}, Lz6/t;->u(Landroid/net/Uri;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    const-string v6, "memory"

    .line 54
    .line 55
    invoke-virtual {v2, v5, v6}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p1, v6}, Lz6/t;->w(Landroid/net/Uri;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_2

    .line 64
    .line 65
    const-string v6, "disk"

    .line 66
    .line 67
    invoke-virtual {v2, v5, v6}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    iget-object p1, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->a:Lcom/facebook/react/bridge/Promise;

    .line 74
    .line 75
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public bridge synthetic doInBackgroundGuarded([Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/react/modules/image/ImageLoaderModule$e;->a([Ljava/lang/Void;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
