.class public final Lio/sentry/android/replay/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lio/sentry/android/replay/t;

.field private static final b:LR0/B;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/android/replay/t;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/android/replay/t;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/android/replay/t;->a:Lio/sentry/android/replay/t;

    .line 7
    .line 8
    new-instance v0, LR0/B;

    .line 9
    .line 10
    const-string v1, "SentryPrivacy"

    .line 11
    .line 12
    sget-object v2, Lio/sentry/android/replay/t$a;->a:Lio/sentry/android/replay/t$a;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, LR0/B;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lio/sentry/android/replay/t;->b:LR0/B;

    .line 18
    .line 19
    sget v0, LR0/B;->e:I

    .line 20
    .line 21
    sput v0, Lio/sentry/android/replay/t;->c:I

    .line 22
    .line 23
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
.method public final a()LR0/B;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/android/replay/t;->b:LR0/B;

    .line 2
    .line 3
    return-object v0
.end method
