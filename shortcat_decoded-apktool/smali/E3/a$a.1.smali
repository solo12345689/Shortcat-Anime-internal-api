.class LE3/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:[B

.field private final b:Landroid/net/Uri;

.field private final c:Lcom/google/common/util/concurrent/p;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/google/common/util/concurrent/p;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, LE3/a$a;->a:[B

    .line 7
    iput-object p1, p0, LE3/a$a;->b:Landroid/net/Uri;

    .line 8
    iput-object p2, p0, LE3/a$a;->c:Lcom/google/common/util/concurrent/p;

    return-void
.end method

.method public constructor <init>([BLcom/google/common/util/concurrent/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LE3/a$a;->a:[B

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, LE3/a$a;->b:Landroid/net/Uri;

    .line 4
    iput-object p2, p0, LE3/a$a;->c:Lcom/google/common/util/concurrent/p;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/a$a;->c:Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    return-object v0
.end method

.method public b(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/a$a;->b:Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public c([B)Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/a$a;->a:[B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method
