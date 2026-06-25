.class public final LOd/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lexpo/modules/webview/DomWebView;


# direct methods
.method public constructor <init>(Lexpo/modules/webview/DomWebView;)V
    .locals 1

    .line 1
    const-string v0, "webView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LOd/g;->a:Lexpo/modules/webview/DomWebView;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final postMessage(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LOd/g;->a:Lexpo/modules/webview/DomWebView;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lexpo/modules/webview/DomWebView;->dispatchMessageEvent(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
