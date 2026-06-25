.class abstract LYg/c;
.super Ljava/lang/Object;


# static fields
.field private static final d:[J


# instance fields
.field protected final a:I

.field protected final b:I

.field protected final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [J

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, LYg/c;->d:[J

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 8
        0x5555555555555555L    # 1.1945305291614955E103
        0x3333333333333333L    # 4.667261458395856E-62
        0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236
        0xff00ff00ff00ffL
        0xffff0000ffffL
        0xffffffffL
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LYg/c;->a:I

    .line 5
    .line 6
    iput p2, p0, LYg/c;->b:I

    .line 7
    .line 8
    iput p3, p0, LYg/c;->c:I

    .line 9
    .line 10
    return-void
.end method
