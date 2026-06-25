.class public final Lze/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lze/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lze/h$a;

.field private static final b:Lze/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lze/h$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lze/h$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lze/h$a;->a:Lze/h$a;

    .line 7
    .line 8
    new-instance v0, Lze/h$a$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lze/h$a$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lze/h$a;->b:Lze/h;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lze/h;
    .locals 1

    .line 1
    const-string v0, "annotations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p1, Lze/h$a;->b:Lze/h;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance v0, Lze/i;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lze/i;-><init>(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final b()Lze/h;
    .locals 1

    .line 1
    sget-object v0, Lze/h$a;->b:Lze/h;

    .line 2
    .line 3
    return-object v0
.end method
