.class final LOd/e$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOd/e;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LOd/e$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LOd/e$e;

    .line 2
    .line 3
    invoke-direct {v0}, LOd/e$e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LOd/e$e;->a:LOd/e$e;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lexpo/modules/webview/DomWebView;Z)V
    .locals 2

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lexpo/modules/webview/DomWebView;->getWebView()Landroid/webkit/WebView;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, LOd/e$e$a;

    .line 11
    .line 12
    invoke-direct {v1, p1, p2}, LOd/e$e$a;-><init>(Lexpo/modules/webview/DomWebView;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/webview/DomWebView;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p1, p2}, LOd/e$e;->a(Lexpo/modules/webview/DomWebView;Z)V

    .line 10
    .line 11
    .line 12
    sget-object p1, LTd/L;->a:LTd/L;

    .line 13
    .line 14
    return-object p1
.end method
