.class public final LI0/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LI0/e;

.field private static b:Lkotlin/jvm/functions/Function2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LI0/e;

    .line 2
    .line 3
    invoke-direct {v0}, LI0/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LI0/e;->a:LI0/e;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sget-object v1, LI0/e$a;->a:LI0/e$a;

    .line 10
    .line 11
    const v2, 0x2637f2a9

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Lg0/i;->b(IZLjava/lang/Object;)Lg0/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, LI0/e;->b:Lkotlin/jvm/functions/Function2;

    .line 19
    .line 20
    return-void
.end method

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
.method public final a()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    sget-object v0, LI0/e;->b:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object v0
.end method
