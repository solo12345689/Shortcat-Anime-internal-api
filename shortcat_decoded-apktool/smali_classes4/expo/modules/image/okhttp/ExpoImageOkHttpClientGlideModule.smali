.class public final Lexpo/modules/image/okhttp/ExpoImageOkHttpClientGlideModule;
.super Li5/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lexpo/modules/image/okhttp/ExpoImageOkHttpClientGlideModule;",
        "Li5/b;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lcom/bumptech/glide/b;",
        "glide",
        "Lcom/bumptech/glide/h;",
        "registry",
        "LTd/L;",
        "a",
        "(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V",
        "expo-image_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Li5/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "glide"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "registry"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Ldg/A$a;

    .line 17
    .line 18
    invoke-direct {p1}, Ldg/A$a;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object p2, Lexpo/modules/image/okhttp/b;->c:Lexpo/modules/image/okhttp/b;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ldg/A$a;->g(Ldg/n;)Ldg/A$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ldg/A$a;->c()Ldg/A;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p2, Lcom/bumptech/glide/integration/okhttp3/a$a;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lcom/bumptech/glide/integration/okhttp3/a$a;-><init>(Ldg/e$a;)V

    .line 34
    .line 35
    .line 36
    const-class v0, LY4/h;

    .line 37
    .line 38
    const-class v1, Ljava/io/InputStream;

    .line 39
    .line 40
    invoke-virtual {p3, v0, v1, p2}, Lcom/bumptech/glide/h;->u(Ljava/lang/Class;Ljava/lang/Class;LY4/o;)Lcom/bumptech/glide/h;

    .line 41
    .line 42
    .line 43
    new-instance p2, Lexpo/modules/image/okhttp/a$a;

    .line 44
    .line 45
    invoke-direct {p2, p1}, Lexpo/modules/image/okhttp/a$a;-><init>(Ldg/A;)V

    .line 46
    .line 47
    .line 48
    const-class p1, LOb/b;

    .line 49
    .line 50
    invoke-virtual {p3, p1, v1, p2}, Lcom/bumptech/glide/h;->p(Ljava/lang/Class;Ljava/lang/Class;LY4/o;)Lcom/bumptech/glide/h;

    .line 51
    .line 52
    .line 53
    return-void
.end method
