.class Lcom/amazon/a/b/f$a$1;
.super Ljava/util/HashMap;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amazon/a/b/f$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Lcom/amazon/a/a/i/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/amazon/a/b/f$a;


# direct methods
.method constructor <init>(Lcom/amazon/a/b/f$a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/amazon/a/b/f$a$1;->a:Lcom/amazon/a/b/f$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string p1, "NO_INTERNET"

    .line 7
    .line 8
    sget-object v0, Lcom/amazon/a/b/e;->d:Lcom/amazon/a/a/i/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string p1, "INVALID_CONTENT_ID"

    .line 14
    .line 15
    sget-object v0, Lcom/amazon/a/b/e;->e:Lcom/amazon/a/a/i/c;

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const-string p1, "INTERNAL_SERVICE_ERROR"

    .line 21
    .line 22
    sget-object v0, Lcom/amazon/a/b/e;->f:Lcom/amazon/a/a/i/c;

    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method
