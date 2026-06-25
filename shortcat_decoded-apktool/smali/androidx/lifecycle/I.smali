.class public final Landroidx/lifecycle/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/I$a;
    }
.end annotation


# static fields
.field public static final c:Landroidx/lifecycle/I$a;


# instance fields
.field private final a:Ljava/util/Map;

.field private b:Lk2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/lifecycle/I$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/lifecycle/I$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/lifecycle/I;->c:Landroidx/lifecycle/I$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/I;->a:Ljava/util/Map;

    .line 6
    new-instance v0, Lk2/b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lk2/b;-><init>(Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/lifecycle/I;->b:Lk2/b;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/I;->a:Ljava/util/Map;

    .line 3
    new-instance v0, Lk2/b;

    invoke-direct {v0, p1}, Lk2/b;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Landroidx/lifecycle/I;->b:Lk2/b;

    return-void
.end method


# virtual methods
.method public final a()LP3/f$b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/I;->b:Lk2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/b;->b()LP3/f$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
