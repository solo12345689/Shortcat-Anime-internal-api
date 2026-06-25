.class final Lcom/google/android/gms/common/o;
.super Lcom/google/android/gms/common/n;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:[B


# direct methods
.method constructor <init>([B)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x19

    .line 3
    .line 4
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0, v0}, Lcom/google/android/gms/common/n;-><init>([B)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/common/o;->b:[B

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method final G3()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/o;->b:[B

    .line 2
    .line 3
    return-object v0
.end method
