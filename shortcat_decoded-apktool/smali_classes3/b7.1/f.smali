.class public final Lb7/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lb7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lb7/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lb7/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lb7/f;->a:Lb7/f;

    .line 7
    .line 8
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

.method public static final a(Ljava/lang/String;Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    new-instance v0, Ldg/C$a;

    .line 12
    .line 13
    invoke-direct {v0}, Ldg/C$a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ldg/C$a;->m(Ljava/lang/String;)Ldg/C$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ldg/C$a;->b()Ldg/C;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    sget-object v0, Lb7/a;->a:Lb7/a;

    .line 25
    .line 26
    invoke-virtual {v0}, Lb7/a;->a()Ldg/A;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p0}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    new-instance v0, Lb7/f$a;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lb7/f$a;-><init>(Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, v0}, Ldg/e;->O1(Ldg/f;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v1, "Not a valid URL: "

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p1, p0}, Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;->onError(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
