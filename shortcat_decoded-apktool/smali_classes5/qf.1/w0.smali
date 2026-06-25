.class public abstract Lqf/w0;
.super Lqf/E0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqf/w0$a;
    }
.end annotation


# static fields
.field public static final c:Lqf/w0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqf/w0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lqf/w0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqf/w0;->c:Lqf/w0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqf/E0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final i(Lqf/v0;Ljava/util/List;)Lqf/E0;
    .locals 1

    .line 1
    sget-object v0, Lqf/w0;->c:Lqf/w0$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lqf/w0$a;->b(Lqf/v0;Ljava/util/List;)Lqf/E0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final j(Ljava/util/Map;)Lqf/w0;
    .locals 1

    .line 1
    sget-object v0, Lqf/w0;->c:Lqf/w0$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lqf/w0$a;->c(Ljava/util/Map;)Lqf/w0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public e(Lqf/S;)Lqf/B0;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lqf/S;->N0()Lqf/v0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Lqf/w0;->k(Lqf/v0;)Lqf/B0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public abstract k(Lqf/v0;)Lqf/B0;
.end method
