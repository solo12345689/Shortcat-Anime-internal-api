.class public final LXe/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXe/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LXe/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LXe/f;)LXe/c;
    .locals 2

    .line 1
    const-string v0, "shortName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LXe/c;

    .line 7
    .line 8
    sget-object v1, LXe/d;->e:LXe/d$a;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, LXe/d$a;->a(LXe/f;)LXe/d;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, LXe/c;-><init>(LXe/d;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
