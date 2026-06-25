.class public final Lpc/I$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lpc/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpc/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, [Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lpc/K$b;->a:Lpc/K$b;

    .line 6
    .line 7
    invoke-static {p1, v0}, Lpc/J;->j([ZLpc/K$a;)Lcom/facebook/react/bridge/WritableArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method public getReturnType()Lec/i;
    .locals 1

    .line 1
    sget-object v0, Lec/i;->v:Lec/i;

    .line 2
    .line 3
    return-object v0
.end method
