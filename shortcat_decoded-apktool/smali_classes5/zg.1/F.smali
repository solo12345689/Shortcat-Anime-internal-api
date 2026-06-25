.class final Lzg/F;
.super Ljava/lang/Object;


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method private constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lzg/F;->a:I

    .line 5
    .line 6
    iput p2, p0, Lzg/F;->b:I

    .line 7
    .line 8
    return-void
.end method

.method static a(II)Lzg/F;
    .locals 1

    .line 1
    new-instance v0, Lzg/F;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lzg/F;-><init>(II)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
