.class public final LH6/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LH6/p;

.field private static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LH6/p;

    .line 2
    .line 3
    invoke-direct {v0}, LH6/p;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH6/p;->a:LH6/p;

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sput v0, LH6/p;->b:I

    .line 17
    .line 18
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a(III)Landroid/util/SparseIntArray;
    .locals 1

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-gt p0, p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0, p2}, Landroid/util/SparseIntArray;->put(II)V

    .line 9
    .line 10
    .line 11
    mul-int/lit8 p0, p0, 0x2

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0
.end method

.method public static final b()LH6/E;
    .locals 7

    .line 1
    new-instance v0, LH6/E;

    .line 2
    .line 3
    sget v6, LH6/p;->b:I

    .line 4
    .line 5
    const/high16 v1, 0x400000

    .line 6
    .line 7
    mul-int v2, v6, v1

    .line 8
    .line 9
    const/high16 v3, 0x20000

    .line 10
    .line 11
    invoke-static {v3, v1, v6}, LH6/p;->a(III)Landroid/util/SparseIntArray;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const/high16 v4, 0x20000

    .line 16
    .line 17
    const/high16 v5, 0x400000

    .line 18
    .line 19
    invoke-direct/range {v0 .. v6}, LH6/E;-><init>(IILandroid/util/SparseIntArray;III)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
