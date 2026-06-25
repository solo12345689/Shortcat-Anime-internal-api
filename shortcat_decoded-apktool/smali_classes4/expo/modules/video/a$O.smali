.class public final Lexpo/modules/video/a$O;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final a:Lexpo/modules/video/a$O;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/video/a$O;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/video/a$O;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/video/a$O;->a:Lexpo/modules/video/a$O;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lexpo/modules/video/VideoView;Lexpo/modules/video/records/ButtonOptions;)V
    .locals 12

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance v1, Lexpo/modules/video/records/ButtonOptions;

    .line 9
    .line 10
    const/16 v10, 0xff

    .line 11
    .line 12
    const/4 v11, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x0

    .line 21
    invoke-direct/range {v1 .. v11}, Lexpo/modules/video/records/ButtonOptions;-><init>(ZZZZLjava/lang/Boolean;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    move-object p2, v1

    .line 25
    :cond_0
    invoke-virtual {p1, p2}, Lexpo/modules/video/VideoView;->setButtonOptions(Lexpo/modules/video/records/ButtonOptions;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/video/VideoView;

    .line 2
    .line 3
    check-cast p2, Lexpo/modules/video/records/ButtonOptions;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/a$O;->a(Lexpo/modules/video/VideoView;Lexpo/modules/video/records/ButtonOptions;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
