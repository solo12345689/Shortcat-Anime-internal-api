.class final LT6/A$a;
.super LT6/A$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT6/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private c:I

.field final synthetic d:LT6/A;


# direct methods
.method public constructor <init>(LT6/A;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT6/A$a;->d:LT6/A;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LT6/A$c;-><init>(LT6/A;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, LT6/A$a;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final d(I)V
    .locals 0

    .line 1
    iput p1, p0, LT6/A$a;->c:I

    .line 2
    .line 3
    return-void
.end method
