.class public abstract Li4/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


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

.method public static c()Li4/h;
    .locals 1

    .line 1
    new-instance v0, Li4/h$a;

    .line 2
    .line 3
    invoke-direct {v0}, Li4/h$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Li4/g;
.end method

.method public final b(Ljava/lang/String;)Li4/g;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Li4/h;->a(Ljava/lang/String;)Li4/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Li4/g;->a(Ljava/lang/String;)Li4/g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    return-object v0
.end method
