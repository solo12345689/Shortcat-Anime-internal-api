.class public final synthetic LM2/H;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt2/n;


# instance fields
.field public final synthetic a:LM2/L$a;

.field public final synthetic b:LM2/y;

.field public final synthetic c:LM2/B;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(LM2/L$a;LM2/y;LM2/B;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/H;->a:LM2/L$a;

    .line 5
    .line 6
    iput-object p2, p0, LM2/H;->b:LM2/y;

    .line 7
    .line 8
    iput-object p3, p0, LM2/H;->c:LM2/B;

    .line 9
    .line 10
    iput-object p4, p0, LM2/H;->d:Ljava/io/IOException;

    .line 11
    .line 12
    iput-boolean p5, p0, LM2/H;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, LM2/H;->a:LM2/L$a;

    .line 2
    .line 3
    iget-object v1, p0, LM2/H;->b:LM2/y;

    .line 4
    .line 5
    iget-object v2, p0, LM2/H;->c:LM2/B;

    .line 6
    .line 7
    iget-object v3, p0, LM2/H;->d:Ljava/io/IOException;

    .line 8
    .line 9
    iget-boolean v4, p0, LM2/H;->e:Z

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    check-cast v5, LM2/L;

    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, LM2/L$a;->b(LM2/L$a;LM2/y;LM2/B;Ljava/io/IOException;ZLM2/L;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
