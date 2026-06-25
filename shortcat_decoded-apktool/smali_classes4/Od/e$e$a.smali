.class final LOd/e$e$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOd/e$e;->a(Lexpo/modules/webview/DomWebView;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/webview/DomWebView;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lexpo/modules/webview/DomWebView;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LOd/e$e$a;->a:Lexpo/modules/webview/DomWebView;

    .line 2
    .line 3
    iput-boolean p2, p0, LOd/e$e$a;->b:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LOd/e$e$a;->a:Lexpo/modules/webview/DomWebView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/webview/DomWebView;->getWebView()Landroid/webkit/WebView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, LOd/e$e$a;->b:Z

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
