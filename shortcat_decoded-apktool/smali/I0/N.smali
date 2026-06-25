.class public abstract LI0/N;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI0/N$a;
    }
.end annotation


# static fields
.field public static final a:LI0/N$a;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LI0/N$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LI0/N$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LI0/N;->a:LI0/N$a;

    .line 8
    .line 9
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    int-to-long v1, v1

    .line 16
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-long v3, v0

    .line 21
    const/16 v0, 0x20

    .line 22
    .line 23
    shl-long v0, v1, v0

    .line 24
    .line 25
    const-wide v5, 0xffffffffL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long v2, v3, v5

    .line 31
    .line 32
    or-long/2addr v0, v2

    .line 33
    invoke-static {v0, v1}, LI0/N;->a(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sput-wide v0, LI0/N;->b:J

    .line 38
    .line 39
    return-void
.end method

.method public static a(J)J
    .locals 0

    .line 1
    return-wide p0
.end method
