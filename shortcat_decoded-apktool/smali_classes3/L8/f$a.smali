.class public final LL8/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:[B

.field private b:Z

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY"

    .line 5
    .line 6
    iput-object v0, p0, LL8/f$a;->c:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()LL8/f;
    .locals 4

    .line 1
    new-instance v0, LL8/f;

    .line 2
    .line 3
    iget-object v1, p0, LL8/f$a;->a:[B

    .line 4
    .line 5
    iget-boolean v2, p0, LL8/f$a;->b:Z

    .line 6
    .line 7
    iget-object v3, p0, LL8/f$a;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, LL8/f;-><init>([BZLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public b([B)LL8/f$a;
    .locals 0

    .line 1
    iput-object p1, p0, LL8/f$a;->a:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Ljava/lang/String;)LL8/f$a;
    .locals 1

    .line 1
    const-string v0, "key cannot be null or empty"

    .line 2
    .line 3
    invoke-static {p1, v0}, LR8/p;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LL8/f$a;->c:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0
.end method

.method public d(Z)LL8/f$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, LL8/f$a;->b:Z

    .line 2
    .line 3
    return-object p0
.end method
