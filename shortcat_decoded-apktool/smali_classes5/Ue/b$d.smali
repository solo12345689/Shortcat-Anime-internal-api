.class public abstract LUe/b$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method private constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LUe/b$d;->a:I

    .line 4
    iput p2, p0, LUe/b$d;->b:I

    return-void
.end method

.method synthetic constructor <init>(IILUe/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LUe/b$d;-><init>(II)V

    return-void
.end method

.method public static a(LUe/b$d;[LZe/j$a;)LUe/b$d;
    .locals 1

    .line 1
    iget v0, p0, LUe/b$d;->a:I

    .line 2
    .line 3
    iget p0, p0, LUe/b$d;->b:I

    .line 4
    .line 5
    add-int/2addr v0, p0

    .line 6
    new-instance p0, LUe/b$c;

    .line 7
    .line 8
    invoke-direct {p0, v0, p1}, LUe/b$c;-><init>(I[LZe/j$a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public static b(LUe/b$d;)LUe/b$b;
    .locals 1

    .line 1
    iget v0, p0, LUe/b$d;->a:I

    .line 2
    .line 3
    iget p0, p0, LUe/b$d;->b:I

    .line 4
    .line 5
    add-int/2addr v0, p0

    .line 6
    new-instance p0, LUe/b$b;

    .line 7
    .line 8
    invoke-direct {p0, v0}, LUe/b$b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public static c()LUe/b$b;
    .locals 2

    .line 1
    new-instance v0, LUe/b$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LUe/b$b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public abstract d(I)Ljava/lang/Object;
.end method

.method public abstract e(Ljava/lang/Object;)I
.end method
