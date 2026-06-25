.class public final Lc4/l$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lc4/l$a;

.field private static b:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc4/l$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lc4/l$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc4/l$a;->a:Lc4/l$a;

    .line 7
    .line 8
    sget-object v0, Lc4/l$a$a;->a:Lc4/l$a$a;

    .line 9
    .line 10
    sput-object v0, Lc4/l$a;->b:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
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
.method public final a()Lc4/l;
    .locals 2

    .line 1
    sget-object v0, Lc4/l$a;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    sget-object v1, Lc4/m;->b:Lc4/m;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lc4/l;

    .line 10
    .line 11
    return-object v0
.end method
