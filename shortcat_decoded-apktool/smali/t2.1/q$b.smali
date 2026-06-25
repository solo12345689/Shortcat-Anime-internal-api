.class final Lt2/q$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:[F

.field private final e:[I

.field private f:I


# direct methods
.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/q$b;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lt2/q$b;->b:I

    .line 7
    .line 8
    iput p3, p0, Lt2/q$b;->c:I

    .line 9
    .line 10
    const/16 p1, 0x10

    .line 11
    .line 12
    new-array p1, p1, [F

    .line 13
    .line 14
    iput-object p1, p0, Lt2/q$b;->d:[F

    .line 15
    .line 16
    const/4 p1, 0x4

    .line 17
    new-array p1, p1, [I

    .line 18
    .line 19
    iput-object p1, p0, Lt2/q$b;->e:[I

    .line 20
    .line 21
    const/16 p1, 0x2601

    .line 22
    .line 23
    iput p1, p0, Lt2/q$b;->f:I

    .line 24
    .line 25
    return-void
.end method

.method public static a(II)Lt2/q$b;
    .locals 12

    .line 1
    const/4 v1, 0x1

    .line 2
    new-array v2, v1, [I

    .line 3
    .line 4
    const v3, 0x8b87

    .line 5
    .line 6
    .line 7
    const/4 v11, 0x0

    .line 8
    invoke-static {p0, v3, v2, v11}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 9
    .line 10
    .line 11
    new-array v7, v1, [I

    .line 12
    .line 13
    aget v2, v2, v11

    .line 14
    .line 15
    new-array v9, v2, [B

    .line 16
    .line 17
    new-array v3, v1, [I

    .line 18
    .line 19
    new-array v5, v1, [I

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    move v0, p0

    .line 26
    move v1, p1

    .line 27
    invoke-static/range {v0 .. v10}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v9}, Lt2/q;->a([B)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-direct {v1, v9, v11, v2}, Ljava/lang/String;-><init>([BII)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v1}, Lt2/q;->c(ILjava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    new-instance v2, Lt2/q$b;

    .line 44
    .line 45
    aget v3, v7, v11

    .line 46
    .line 47
    invoke-direct {v2, v1, v0, v3}, Lt2/q$b;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    return-object v2
.end method
