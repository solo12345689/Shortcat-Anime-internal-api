.class public final LE3/S6$a;
.super Lcom/google/common/util/concurrent/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/S6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final h:I

.field private final i:Ljava/lang/Object;


# direct methods
.method private constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/common/util/concurrent/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LE3/S6$a;->h:I

    .line 5
    .line 6
    iput-object p2, p0, LE3/S6$a;->i:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static J(ILjava/lang/Object;)LE3/S6$a;
    .locals 1

    .line 1
    new-instance v0, LE3/S6$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LE3/S6$a;-><init>(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public F(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/common/util/concurrent/a;->F(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public K()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S6$a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public L()I
    .locals 1

    .line 1
    iget v0, p0, LE3/S6$a;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public M()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/S6$a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LE3/S6$a;->F(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
