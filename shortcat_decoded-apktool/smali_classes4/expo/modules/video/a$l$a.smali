.class final Lexpo/modules/video/a$l$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/a$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroid/media/MediaMetadataRetriever;

.field final synthetic c:J

.field final synthetic d:Lexpo/modules/video/records/VideoThumbnailOptions;


# direct methods
.method constructor <init>(Landroid/media/MediaMetadataRetriever;JLexpo/modules/video/records/VideoThumbnailOptions;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/a$l$a;->b:Landroid/media/MediaMetadataRetriever;

    .line 2
    .line 3
    iput-wide p2, p0, Lexpo/modules/video/a$l$a;->c:J

    .line 4
    .line 5
    iput-object p4, p0, Lexpo/modules/video/a$l$a;->d:Lexpo/modules/video/records/VideoThumbnailOptions;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, Lexpo/modules/video/a$l$a;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/video/a$l$a;->b:Landroid/media/MediaMetadataRetriever;

    .line 4
    .line 5
    iget-wide v2, p0, Lexpo/modules/video/a$l$a;->c:J

    .line 6
    .line 7
    iget-object v4, p0, Lexpo/modules/video/a$l$a;->d:Lexpo/modules/video/records/VideoThumbnailOptions;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lexpo/modules/video/a$l$a;-><init>(Landroid/media/MediaMetadataRetriever;JLexpo/modules/video/records/VideoThumbnailOptions;LZd/e;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/a$l$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/video/a$l$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/video/a$l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/a$l$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/video/a$l$a;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/video/a$l$a;->b:Landroid/media/MediaMetadataRetriever;

    .line 12
    .line 13
    iget-wide v0, p0, Lexpo/modules/video/a$l$a;->c:J

    .line 14
    .line 15
    iget-object v2, p0, Lexpo/modules/video/a$l$a;->d:Lexpo/modules/video/records/VideoThumbnailOptions;

    .line 16
    .line 17
    invoke-static {p1, v0, v1, v2}, LFd/q;->d(Landroid/media/MediaMetadataRetriever;JLexpo/modules/video/records/VideoThumbnailOptions;)Lexpo/modules/video/VideoThumbnail;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method
