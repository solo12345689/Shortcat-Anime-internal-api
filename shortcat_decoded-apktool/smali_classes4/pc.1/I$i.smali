.class public final Lpc/I$i;
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
    name = "i"
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
    .locals 2

    .line 1
    check-cast p1, LEf/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, LEf/a;->S()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sget-object p1, LEf/d;->e:LEf/d;

    .line 10
    .line 11
    invoke-static {v0, v1, p1}, LEf/a;->N(JLEf/d;)D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method public getReturnType()Lec/i;
    .locals 1

    .line 1
    sget-object v0, Lec/i;->c:Lec/i;

    .line 2
    .line 3
    return-object v0
.end method
