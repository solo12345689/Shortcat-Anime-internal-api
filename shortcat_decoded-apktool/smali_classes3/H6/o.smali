.class public final LH6/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LH6/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LH6/o;

    .line 2
    .line 3
    invoke-direct {v0}, LH6/o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH6/o;->a:LH6/o;

    .line 7
    .line 8
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

.method public static final a()LH6/E;
    .locals 4

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x4000

    .line 7
    .line 8
    const/4 v2, 0x5

    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 10
    .line 11
    .line 12
    new-instance v1, LH6/E;

    .line 13
    .line 14
    const v2, 0x14000

    .line 15
    .line 16
    .line 17
    const/high16 v3, 0x100000

    .line 18
    .line 19
    invoke-direct {v1, v2, v3, v0}, LH6/E;-><init>(IILandroid/util/SparseIntArray;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method
