.class final LG/s$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG/s;->h(LF/u;ILG/r;IIIIIIJLz/q;Ll0/e$c;Ll0/e$b;ZJIILjava/util/List;LA/k;LY/C0;LGf/O;Lie/o;)LG/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/u;

.field final synthetic b:J

.field final synthetic c:LG/r;

.field final synthetic d:J

.field final synthetic e:Lz/q;

.field final synthetic f:Ll0/e$b;

.field final synthetic g:Ll0/e$c;

.field final synthetic h:Z

.field final synthetic i:I


# direct methods
.method constructor <init>(LF/u;JLG/r;JLz/q;Ll0/e$b;Ll0/e$c;ZI)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/s$c;->a:LF/u;

    .line 2
    .line 3
    iput-wide p2, p0, LG/s$c;->b:J

    .line 4
    .line 5
    iput-object p4, p0, LG/s$c;->c:LG/r;

    .line 6
    .line 7
    iput-wide p5, p0, LG/s$c;->d:J

    .line 8
    .line 9
    iput-object p7, p0, LG/s$c;->e:Lz/q;

    .line 10
    .line 11
    iput-object p8, p0, LG/s$c;->f:Ll0/e$b;

    .line 12
    .line 13
    iput-object p9, p0, LG/s$c;->g:Ll0/e$c;

    .line 14
    .line 15
    iput-boolean p10, p0, LG/s$c;->h:Z

    .line 16
    .line 17
    iput p11, p0, LG/s$c;->i:I

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(I)LG/e;
    .locals 13

    .line 1
    iget-object v0, p0, LG/s$c;->a:LF/u;

    .line 2
    .line 3
    iget-wide v2, p0, LG/s$c;->b:J

    .line 4
    .line 5
    iget-object v4, p0, LG/s$c;->c:LG/r;

    .line 6
    .line 7
    iget-wide v5, p0, LG/s$c;->d:J

    .line 8
    .line 9
    iget-object v7, p0, LG/s$c;->e:Lz/q;

    .line 10
    .line 11
    iget-object v8, p0, LG/s$c;->f:Ll0/e$b;

    .line 12
    .line 13
    iget-object v9, p0, LG/s$c;->g:Ll0/e$c;

    .line 14
    .line 15
    invoke-interface {v0}, LI0/m;->getLayoutDirection()Li1/t;

    .line 16
    .line 17
    .line 18
    move-result-object v10

    .line 19
    iget-boolean v11, p0, LG/s$c;->h:Z

    .line 20
    .line 21
    iget v12, p0, LG/s$c;->i:I

    .line 22
    .line 23
    move v1, p1

    .line 24
    invoke-static/range {v0 .. v12}, LG/s;->a(LF/u;IJLG/r;JLz/q;Ll0/e$b;Ll0/e$c;Li1/t;ZI)LG/e;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, LG/s$c;->a(I)LG/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
