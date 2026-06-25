.class public final LQ2/k$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LQ2/k$a;->a:I

    .line 5
    .line 6
    iput p2, p0, LQ2/k$a;->b:I

    .line 7
    .line 8
    iput p3, p0, LQ2/k$a;->c:I

    .line 9
    .line 10
    iput p4, p0, LQ2/k$a;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p1, v1, :cond_1

    .line 4
    .line 5
    iget p1, p0, LQ2/k$a;->a:I

    .line 6
    .line 7
    iget v2, p0, LQ2/k$a;->b:I

    .line 8
    .line 9
    sub-int/2addr p1, v2

    .line 10
    if-le p1, v1, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    return v0

    .line 14
    :cond_1
    iget p1, p0, LQ2/k$a;->c:I

    .line 15
    .line 16
    iget v2, p0, LQ2/k$a;->d:I

    .line 17
    .line 18
    sub-int/2addr p1, v2

    .line 19
    if-le p1, v1, :cond_2

    .line 20
    .line 21
    return v1

    .line 22
    :cond_2
    return v0
.end method
