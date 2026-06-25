.class final Lcom/facebook/react/devsupport/y0$a;
.super Landroid/os/AsyncTask;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/y0$a$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/facebook/react/devsupport/y0$a$a;

.field private static final c:Ldg/x;


# instance fields
.field private final a:Lc7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/y0$a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/y0$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/y0$a;->b:Lcom/facebook/react/devsupport/y0$a$a;

    .line 8
    .line 9
    sget-object v0, Ldg/x;->e:Ldg/x$a;

    .line 10
    .line 11
    const-string v1, "application/json; charset=utf-8"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ldg/x$a;->a(Ljava/lang/String;)Ldg/x;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/facebook/react/devsupport/y0$a;->c:Ldg/x;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lc7/f;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/devsupport/y0$a;->a:Lc7/f;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method protected varargs a([Lc7/k;)Ljava/lang/Void;
    .locals 9

    .line 1
    const-string v0, "toString(...)"

    .line 2
    .line 3
    const-string v1, "stackFrames"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_0
    iget-object v2, p0, Lcom/facebook/react/devsupport/y0$a;->a:Lc7/f;

    .line 10
    .line 11
    invoke-interface {v2}, Lc7/f;->u()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "/open-stack-frame"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2, v1}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object v3, Lb7/a;->a:Lb7/a;

    .line 45
    .line 46
    invoke-virtual {v3}, Lb7/a;->a()Ldg/A;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    array-length v4, p1

    .line 51
    const/4 v5, 0x0

    .line 52
    :goto_0
    if-ge v5, v4, :cond_1

    .line 53
    .line 54
    aget-object v6, p1, v5

    .line 55
    .line 56
    sget-object v7, Lcom/facebook/react/devsupport/y0$a;->b:Lcom/facebook/react/devsupport/y0$a$a;

    .line 57
    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    invoke-static {v7, v6}, Lcom/facebook/react/devsupport/y0$a$a;->a(Lcom/facebook/react/devsupport/y0$a$a;Lc7/k;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sget-object v7, Ldg/D;->a:Ldg/D$a;

    .line 72
    .line 73
    sget-object v8, Lcom/facebook/react/devsupport/y0$a;->c:Ldg/x;

    .line 74
    .line 75
    invoke-virtual {v7, v8, v6}, Ldg/D$a;->a(Ldg/x;Ljava/lang/String;)Ldg/D;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    new-instance v7, Ldg/C$a;

    .line 80
    .line 81
    invoke-direct {v7}, Ldg/C$a;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7, v2}, Ldg/C$a;->m(Ljava/lang/String;)Ldg/C$a;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v7, v6}, Ldg/C$a;->h(Ldg/D;)Ldg/C$a;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6}, Ldg/C$a;->b()Ldg/C;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v3, v6}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-interface {v6}, Ldg/e;->b()Ldg/E;

    .line 101
    .line 102
    .line 103
    add-int/lit8 v5, v5, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catch_0
    move-exception p1

    .line 107
    goto :goto_1

    .line 108
    :cond_0
    const-string p1, "Required value was null."

    .line 109
    .line 110
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :goto_1
    const-string v0, "ReactNative"

    .line 117
    .line 118
    const-string v2, "Could not open stack frame"

    .line 119
    .line 120
    invoke-static {v0, v2, p1}, Lz5/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    :cond_1
    return-object v1
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Lc7/k;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/y0$a;->a([Lc7/k;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
