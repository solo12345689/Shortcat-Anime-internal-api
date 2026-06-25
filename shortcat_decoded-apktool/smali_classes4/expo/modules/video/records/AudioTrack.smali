.class public final Lexpo/modules/video/records/AudioTrack;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/video/records/AudioTrack$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0017\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\r\u0012\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\r\u0012\u0004\u0008\u0013\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u000fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\r\u0012\u0004\u0008\u0015\u0010\u0011\u001a\u0004\u0008\u0014\u0010\u000fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\r\u0012\u0004\u0008\u0017\u0010\u0011\u001a\u0004\u0008\u0016\u0010\u000fR \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u0018\u0012\u0004\u0008\u001a\u0010\u0011\u001a\u0004\u0008\t\u0010\u0019R \u0010\n\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0018\u0012\u0004\u0008\u001c\u0010\u0011\u001a\u0004\u0008\u001b\u0010\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "Lexpo/modules/video/records/AudioTrack;",
        "Ljc/b;",
        "Ljava/io/Serializable;",
        "",
        "id",
        "language",
        "label",
        "name",
        "",
        "isDefault",
        "autoSelect",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "getId$annotations",
        "()V",
        "getLanguage",
        "getLanguage$annotations",
        "getLabel",
        "getLabel$annotations",
        "getName",
        "getName$annotations",
        "Z",
        "()Z",
        "isDefault$annotations",
        "getAutoSelect",
        "getAutoSelect$annotations",
        "Companion",
        "a",
        "expo-video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lexpo/modules/video/records/AudioTrack$a;


# instance fields
.field private final autoSelect:Z

.field private final id:Ljava/lang/String;

.field private final isDefault:Z

.field private final label:Ljava/lang/String;

.field private final language:Ljava/lang/String;

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/video/records/AudioTrack$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/video/records/AudioTrack$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/video/records/AudioTrack;->Companion:Lexpo/modules/video/records/AudioTrack$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 1

    .line 1
    const-string v0, "id"

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
    iput-object p1, p0, Lexpo/modules/video/records/AudioTrack;->id:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lexpo/modules/video/records/AudioTrack;->language:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lexpo/modules/video/records/AudioTrack;->label:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p4, p0, Lexpo/modules/video/records/AudioTrack;->name:Ljava/lang/String;

    .line 16
    .line 17
    iput-boolean p5, p0, Lexpo/modules/video/records/AudioTrack;->isDefault:Z

    .line 18
    .line 19
    iput-boolean p6, p0, Lexpo/modules/video/records/AudioTrack;->autoSelect:Z

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic getAutoSelect$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getLabel$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getLanguage$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getName$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic isDefault$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getAutoSelect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/records/AudioTrack;->autoSelect:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/AudioTrack;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/AudioTrack;->label:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/AudioTrack;->language:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/records/AudioTrack;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isDefault()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/records/AudioTrack;->isDefault:Z

    .line 2
    .line 3
    return v0
.end method
